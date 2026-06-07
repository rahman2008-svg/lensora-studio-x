package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider
import com.example.data.database.LensoraDatabase
import com.example.data.repository.LensoraRepository
import com.example.ui.LensoraApp
import com.example.ui.LensoraViewModel
import com.example.ui.LensoraViewModelFactory
import com.example.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Room database and repository instantiation safely
        val database = LensoraDatabase.getDatabase(applicationContext)
        val repository = LensoraRepository(database)

        // Setup viewModel with Custom factory to support constructor injection cleanly
        val viewModelFactory = LensoraViewModelFactory(application, repository)
        val viewModel = ViewModelProvider(this, viewModelFactory)[LensoraViewModel::class.java]

        setContent {
            MyApplicationTheme {
                LensoraApp(viewModel = viewModel)
            }
        }
    }
}
