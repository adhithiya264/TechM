import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class PlaceBetsPage extends StatelessWidget {
  final FirebaseFirestore _firestore = FirebaseFirestore.instance;

  PlaceBetsPage({super.key});


  void _placeBet(BuildContext context, String matchId, String selectedTeam, double amount) {

    _firestore.collection('user_bets').add({
      'match_id': matchId,
      'selected_team': selectedTeam,
      'amount': amount,
      'timestamp': FieldValue.serverTimestamp(),
    });


    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(content: Text('Bet of \$${amount.toStringAsFixed(2)} placed on $selectedTeam')),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Place Bets'),
      ),
      body: StreamBuilder<QuerySnapshot>(
        stream: _firestore.collection('football_matches').snapshots(),
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
                subtitle: Text('Odds: ${match['odds1']} - ${match['odds2']}'),
                onTap: () {

                  showDialog(
                    context: context,
                    builder: (context) {
                      double betAmount = 0;

                      return AlertDialog(
                        title: Text('Place Bet'),
                        content: Column(
                          mainAxisSize: MainAxisSize.min,
                          children: [
                            Text('Which team do you want to bet on?'),
                 
                            TextField(
                              keyboardType: TextInputType.numberWithOptions(decimal: true),
                              decoration: InputDecoration(
                                labelText: 'Enter bet amount',
                                hintText: 'Enter amount',
                                border: OutlineInputBorder(),
                              ),
                              onChanged: (value) {
                                betAmount = double.tryParse(value) ?? 0;
                              },
                            ),
                            SizedBox(height: 10),
                            ElevatedButton(
                              onPressed: () {
                                if (betAmount > 0) {
                                  _placeBet(context, match.id, match['team1'], betAmount);
                                  Navigator.pop(context);
                                } else {
                                  ScaffoldMessenger.of(context).showSnackBar(
                                    SnackBar(content: Text('Please enter a valid amount')),
                                  );
                                }
                              },
                              child: Text('Bet on ${match['team1']}'),
                            ),
                            ElevatedButton(
                              onPressed: () {
                                if (betAmount > 0) {
                                  _placeBet(context, match.id, match['team2'], betAmount);
                                  Navigator.pop(context);
                                } else {
                                  ScaffoldMessenger.of(context).showSnackBar(
                                    SnackBar(content: Text('Please enter a valid amount')),
                                  );
                                }
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
    );
  }
}
