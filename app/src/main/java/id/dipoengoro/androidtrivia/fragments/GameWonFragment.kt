package id.dipoengoro.androidtrivia.fragments

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.core.app.ShareCompat
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import id.dipoengoro.androidtrivia.R
import id.dipoengoro.androidtrivia.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {
    private lateinit var binding: FragmentGameWonBinding
    private lateinit var args: GameWonFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGameWonBinding.inflate(inflater, container, false)
        binding.nextMatchButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_gameWonFragment_to_gameFragment)
        )
        args = GameWonFragmentArgs.fromBundle(requireArguments())
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.winner_menu, menu)
        if (getShareIntent().resolveActivity(requireActivity().packageManager) == null)
            menu.findItem(R.id.share).isVisible = false
    }


    private fun getShareIntent(): Intent = ShareCompat.IntentBuilder(requireActivity())
        .setText(getString(R.string.share_success_text, args.numCorrect, args.numQuestions))
        .setType("text/plain")
        .intent

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.share -> startActivity(getShareIntent())
        }
        return super.onOptionsItemSelected(item)
    }
}