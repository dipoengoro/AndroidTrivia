package id.dipoengoro.androidtrivia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import id.dipoengoro.androidtrivia.R
import id.dipoengoro.androidtrivia.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {
    private lateinit var binding: FragmentGameWonBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGameWonBinding.inflate(inflater, container, false)
        binding.nextMatchButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_gameWonFragment_to_gameFragment)
        )
        return binding.root
    }
}