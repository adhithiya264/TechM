
import 'package:firebase_core/firebase_core.dart' show FirebaseOptions;
import 'package:flutter/foundation.dart'
    show defaultTargetPlatform, kIsWeb, TargetPlatform;


class DefaultFirebaseOptions {
  static FirebaseOptions get currentPlatform {
    if (kIsWeb) {
      return web;
    }
    switch (defaultTargetPlatform) {
      case TargetPlatform.android:
        return android;
      case TargetPlatform.iOS:
        return ios;
      case TargetPlatform.macOS:
        return macos;
      case TargetPlatform.windows:
        return windows;
      case TargetPlatform.linux:
        throw UnsupportedError(
          'DefaultFirebaseOptions have not been configured for linux - '
          'you can reconfigure this by running the FlutterFire CLI again.',
        );
      default:
        throw UnsupportedError(
          'DefaultFirebaseOptions are not supported for this platform.',
        );
    }
  }

  static const FirebaseOptions web = FirebaseOptions(
    apiKey: 'myapikey',
    appId: '1:598599967145:web:0652aba4ef0eb9f7f7a4b8',
    messagingSenderId: '598599967145',
    projectId: 'flutproject2',
    authDomain: 'flutproject2.firebaseapp.com',
    storageBucket: 'flutproject2.firebasestorage.app',
    measurementId: 'G-YQ59X0ESZJ',
  );

  static const FirebaseOptions android = FirebaseOptions(
    apiKey: 'myapikey',
    appId: '1:598599967145:android:5e5c926477128994f7a4b8',
    messagingSenderId: '598599967145',
    projectId: 'flutproject2',
    storageBucket: 'flutproject2.firebasestorage.app',
  );

  static const FirebaseOptions ios = FirebaseOptions(
    apiKey: 'myapikey',
    appId: '1:598599967145:ios:68900725ea352c93f7a4b8',
    messagingSenderId: '598599967145',
    projectId: 'flutproject2',
    storageBucket: 'flutproject2.firebasestorage.app',
    iosBundleId: 'com.example.flutproject2',
  );

  static const FirebaseOptions macos = FirebaseOptions(
    apiKey: 'myapikey',
    appId: '1:598599967145:ios:68900725ea352c93f7a4b8',
    messagingSenderId: '598599967145',
    projectId: 'flutproject2',
    storageBucket: 'flutproject2.firebasestorage.app',
    iosBundleId: 'com.example.flutproject2',
  );

  static const FirebaseOptions windows = FirebaseOptions(
    apiKey: 'myapikey',
    appId: '1:598599967145:web:b034f58db4b60182f7a4b8',
    messagingSenderId: '598599967145',
    projectId: 'flutproject2',
    authDomain: 'flutproject2.firebaseapp.com',
    storageBucket: 'flutproject2.firebasestorage.app',
    measurementId: 'G-W7XPCS9T2F',
  );
}
