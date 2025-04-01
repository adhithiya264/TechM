import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class BetHistoryPage extends StatelessWidget {
  final FirebaseFirestore _firestore = FirebaseFirestore.instance;

   BetHistoryPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Bet History'),
      ),
      body: StreamBuilder<QuerySnapshot>(
        stream: _firestore.collection('user_bets').orderBy('timestamp', descending: true).snapshots(),
        builder: (context, snapshot) {
          if (snapshot.connectionState == ConnectionState.waiting) {
            return Center(child: CircularProgressIndicator());
          }
          if (!snapshot.hasData || snapshot.data!.docs.isEmpty) {
            return Center(child: Text("No bets placed yet"));
          }

          var bets = snapshot.data!.docs;
          return ListView.builder(
            itemCount: bets.length,
            itemBuilder: (context, index) {
              var bet = bets[index];
              return ListTile(
                title: Text('Bet on: ${bet['selected_team']}'),
                subtitle: Text('Amount: \$${bet['amount']}'),
                trailing: Text('Match ID: ${bet['match_id']}'),
              );
            },
          );
        },
      ),
    );
  }
}
