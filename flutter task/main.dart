import 'package:flutter/material.dart';
import 'package:firebase_core/firebase_core.dart';
import 'add_teams_page.dart';  // Page for adding football teams
import 'place_bets_page.dart'; // Page for placing bets
import 'home_page.dart';       // Home page for listing teams, scores, and odds

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp();  // Initialize Firebase
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Football Scores & Betting Odds',
      initialRoute: '/',
      routes: {
        '/': (context) => HomePage(),        // Home Page
        '/add_teams': (context) => AddTeamsPage(),  // Add Teams Page
        '/place_bets': (context) => PlaceBetsPage(), // Place Bets Page
      },
    );
  }
}
