import 'package:flutter/material.dart';
import 'package:firebase_core/firebase_core.dart';
import 'add_teams_page.dart';  
import 'place_bets_page.dart'; 
import 'home_page.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp();  
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Football Scores & Betting Odds',
      initialRoute: '/',
      routes: {
        '/': (context) => HomePage(),        
        '/add_teams': (context) => AddTeamsPage(),  
        '/place_bets': (context) => PlaceBetsPage(), 
      },
    );
  }
}
