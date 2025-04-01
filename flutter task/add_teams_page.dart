import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class AddTeamsPage extends StatefulWidget {
  const AddTeamsPage({super.key});

  @override
  _AddTeamsPageState createState() => _AddTeamsPageState();
}

class _AddTeamsPageState extends State<AddTeamsPage> {
  final _team1Controller = TextEditingController();
  final _team2Controller = TextEditingController();
  final _score1Controller = TextEditingController();
  final _score2Controller = TextEditingController();
  final _odds1Controller = TextEditingController();
  final _odds2Controller = TextEditingController();

  final FirebaseFirestore _firestore = FirebaseFirestore.instance;

  void _addMatch() {
    _firestore.collection('football_matches').add({  // Use football_matches collection
      'team1': _team1Controller.text,
      'team2': _team2Controller.text,
      'score1': _score1Controller.text,
      'score2': _score2Controller.text,
      'odds1': _odds1Controller.text,
      'odds2': _odds2Controller.text,
    });

    // Clear the text fields after adding the match
    _team1Controller.clear();
    _team2Controller.clear();
    _score1Controller.clear();
    _score2Controller.clear();
    _odds1Controller.clear();
    _odds2Controller.clear();

    // Return to the home page after adding
    Navigator.pop(context);
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Add Football Match'),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            TextField(
              controller: _team1Controller,
              decoration: InputDecoration(labelText: 'Team 1'),
            ),
            TextField(
              controller: _team2Controller,
              decoration: InputDecoration(labelText: 'Team 2'),
            ),
            TextField(
              controller: _score1Controller,
              decoration: InputDecoration(labelText: 'Score 1'),
            ),
            TextField(
              controller: _score2Controller,
              decoration: InputDecoration(labelText: 'Score 2'),
            ),
            TextField(
              controller: _odds1Controller,
              decoration: InputDecoration(labelText: 'Odds for Team 1'),
            ),
            TextField(
              controller: _odds2Controller,
              decoration: InputDecoration(labelText: 'Odds for Team 2'),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: _addMatch,
              child: Text('Add Match'),
            ),
          ],
        ),
      ),
    );
  }
}
