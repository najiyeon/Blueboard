package com.se.blueboard;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.Firebase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // main screen (9 buttons)
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Firestore test
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        Button firestoreButton = findViewById(R.id.firestore);
        firestoreButton.setOnClickListener(v -> {
            // Add a new document with a generated id.
            Map<String, Object> data = new HashMap<>();
            data.put("name", "Tokyo");
            data.put("country", "Japan");

            db.collection("cities")
                    .add(data)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written with ID: " + documentReference.getId());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        });

        // Login button
        Button loginButton = findViewById(R.id.login);
        loginButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
        });

        // Announcement button
        Button announcementButton = findViewById(R.id.announcement);
        announcementButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Announcement.class);
            startActivity(intent);
        });

        // Attendance button
        Button attendanceButton = findViewById(R.id.attendance);
        attendanceButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Attendance.class);
            startActivity(intent);
        });

        // Contents button
        Button contentsButton = findViewById(R.id.contents);
        contentsButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Contents.class);
            startActivity(intent);
        });

        // Groups button
        Button groupsButton = findViewById(R.id.groups);
        groupsButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Groups.class);
            startActivity(intent);
        });

        // Home button
        Button homeButton = findViewById(R.id.home);
        homeButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Home.class);
            startActivity(intent);
        });

        // Lecture button
        Button lectureButton = findViewById(R.id.lecture);
        lectureButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Lecture.class);
            startActivity(intent);
        });

        // Message button
        Button messageButton = findViewById(R.id.message);
        messageButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Message.class);
            startActivity(intent);
        });

        // Profile button
        Button profileButton = findViewById(R.id.profile);
        profileButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Profile.class);
            startActivity(intent);
        });

    }
}