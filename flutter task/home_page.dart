import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'bet_history_page.dart';   // Bet history page

class HomePage extends StatelessWidget {
  final FirebaseFirestore _firestore = FirebaseFirestore.instance;

  HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Football Scores & Betting Odds'),
        actions: [
          IconButton(
            icon: Icon(Icons.history),
            onPressed: () {
              // Navigate to the Bet History page
              Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => BetHistoryPage()),
              );
            },
            tooltip: 'View Bet History',
          ),
        ],
      ),
      body: StreamBuilder<QuerySnapshot>(
        stream: _firestore.collection('football_matches').snapshots(),  // Use football_matches collection
        builder: (context, snapshot) {
          if (snapshot.connectionState == ConnectionState.waiting) {
            return Center(child: CircularProgressIndicator());
          }
          if (!snapshot.hasData || snapshot.data!.docs.isEmpty) {
            return Center(child: Text("No matches available"));
          }

          var matches = snapshot.data!.docs;
          return ListView.builder(
            itemCount: matches.length,
            itemBuilder: (context, index) {
              var match = matches[index];
              return ListTile(
                title: Text('${match['team1']} vs ${match['team2']}'),
                subtitle: Text(
                    'Score: ${match['score1']} - ${match['score2']} \nOdds: ${match['odds1']} - ${match['odds2']}'),
                onTap: () {
                  // Show options to place a bet when the user taps the match
                  showDialog(
                    context: context,
                    builder: (context) {
                      return AlertDialog(
                        title: Text('Place Bet'),
                        content: Column(
                          mainAxisSize: MainAxisSize.min,
                          children: [
                            Text('Which team do you want to bet on?'),
                            ElevatedButton(
                              onPressed: () {
                                _placeBet(context, match.id, match['team1']);
                                Navigator.pop(context);
                              },
                              child: Text('Bet on ${match['team1']}'),
                            ),
                            ElevatedButton(
                              onPressed: () {
                                _placeBet(context, match.id, match['team2']);
                                Navigator.pop(context);
                              },
                              child: Text('Bet on ${match['team2']}'),
                            ),
                          ],
                        ),
                      );
                    },
                  );
                },
              );
            },
          );
        },
      ),
      floatingActionButton: Row(
        mainAxisAlignment: MainAxisAlignment.end,
        children: [
          FloatingActionButton(
            onPressed: () {
              // Navigate to the Add Teams Page
              Navigator.pushNamed(context, '/add_teams');
            },
            tooltip: 'Add Other Football Teams',
            child: Icon(Icons.add),
          ),
          SizedBox(width: 10),
          FloatingActionButton(
            onPressed: () {
              // Navigate to the Place Bets Page
              Navigator.pushNamed(context, '/place_bets');
            },
            tooltip: 'Place Bets',
            child: Icon(Icons.remove),
          ),
        ],
      ),
    );
  }

  // Method to place a bet on a match
  void _placeBet(BuildContext context, String matchId, String selectedTeam) {
    FirebaseFirestore.instance.collection('user_bets').add({
      'match_id': matchId,
      'selected_team': selectedTeam,
      'amount': 100, // This could be a value entered by the user
      'timestamp': FieldValue.serverTimestamp(),
    });

    // After placing a bet, show a confirmation message
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(content: Text('Bet placed on $selectedTeam')),
    );
  }
}
