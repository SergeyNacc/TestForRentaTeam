package nacc.sergey.testforrentateam.presentation.item

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nacc.sergey.testforrentateam.R
import nacc.sergey.testforrentateam.databinding.FragmentItemBinding
import nacc.sergey.testforrentateam.databinding.FragmentListBinding


class ItemFragment : Fragment(R.layout.fragment_item) {

    private var binding: FragmentItemBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentItemBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}