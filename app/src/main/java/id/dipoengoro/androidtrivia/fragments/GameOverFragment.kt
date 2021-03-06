package id.dipoengoro.androidtrivia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import id.dipoengoro.androidtrivia.R
import id.dipoengoro.androidtrivia.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {

    private lateinit var binding: FragmentGameOverBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGameOverBinding.inflate(inflater, container, false)
        binding.tryAgainButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_gameOverFragment_to_gameFragment)
        )
        return binding.root
    }
}