package com.mobteam.taxapp.features.quizes.ui

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import by.kirich1409.viewbindingdelegate.viewBinding
import coil.load
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.FragmentQuizBinding
import com.mobteam.taxapp.domain.CoursesRepository
import com.mobteam.taxapp.features.quizes.presentation.QuizState
import com.mobteam.taxapp.features.quizes.presentation.QuizViewModel
import com.mobteam.taxapp.features.quizes.presentation.QuizViewModelFactory
import kotlinx.coroutines.launch

class QuizFragment : Fragment(R.layout.fragment_quiz) {

    private val binding by viewBinding(FragmentQuizBinding::bind)
    private val viewModel: QuizViewModel by viewModels(
        factoryProducer = { QuizViewModelFactory(CoursesRepository()) })


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.init()
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.state.collect { render(it) }
            }
        }
    }

    private fun render(state: QuizState) {
        with(binding) {
            currentProgress.text = getString(
                R.string.quiz_currentProgress,
                state.questions.indexOf(state.currentQuestion) + 1,
                state.questions.size
            )
            image.load(state.currentQuestion?.imageUrl)
            title.text = state.currentQuestion?.questionName
            continueButton.text = getString(
                if (state.questions.indexOf(state.currentQuestion) == state.questions.size - 1) {
                    R.string.quiz_button_end
                } else {
                    R.string.quiz_button_continue
                }
            )
            continueButton.setOnClickListener {
                if (state.questions.indexOf(state.currentQuestion) == state.questions.size - 1) {
                } else {
                    viewModel.clickNext()
                }
            }
        }
        bindFirstAnswer(state)
        bindSecondAnswer(state)
        bindThirdAnswer(state)
        bindFourthAnswer(state)
    }

    private fun bindFirstAnswer(state: QuizState) {

        with(binding.firstAnswer) {
            answerText.text = state.currentQuestion?.answers?.first()?.text
            container.setOnClickListener {
                viewModel.setAnswer(state.currentQuestion?.answers?.first())
                val isCorrect =
                    state.currentQuestion?.answers?.first()?.answerId == state.currentQuestion?.correctAnswerId
                hint.backgroundTintList = ColorStateList.valueOf(
                    if (isCorrect) {
                        requireContext().getColor(R.color.positive_hint)
                    } else {
                        requireContext().getColor(R.color.negative_hint)
                    }
                )
                hint.setTextColor(
                    if (isCorrect) {
                        requireContext().getColor(R.color.positive_text_hint)
                    } else {
                        requireContext().getColor(R.color.negative_text_hint)
                    }
                )
                hint.text = if (isCorrect) {
                    state.currentQuestion?.positiveMessage
                } else {
                    state.currentQuestion?.negativeMessage
                }
            }
            hint.isVisible = state.selectedAnswer == state.currentQuestion?.answers?.first()
            radioButton.isChecked =
                state.selectedAnswer == state.currentQuestion?.answers?.first()
        }
    }

    private fun bindSecondAnswer(state: QuizState) {
        with(binding.secondAnswer) {
            answerText.text = state.currentQuestion?.answers?.get(1)?.text
            container.setOnClickListener {
                viewModel.setAnswer(state.currentQuestion?.answers?.get(1))
                val isCorrect =
                    state.currentQuestion?.answers?.get(1)?.answerId == state.currentQuestion?.correctAnswerId
                hint.backgroundTintList = ColorStateList.valueOf(
                    if (isCorrect) {
                        requireContext().getColor(R.color.positive_hint)
                    } else {
                        requireContext().getColor(R.color.negative_hint)
                    }
                )
                hint.setTextColor(
                    if (isCorrect) {
                        requireContext().getColor(R.color.positive_text_hint)
                    } else {
                        requireContext().getColor(R.color.negative_text_hint)
                    }
                )
                hint.text = if (isCorrect) {
                    state.currentQuestion?.positiveMessage
                } else {
                    state.currentQuestion?.negativeMessage
                }
            }
            hint.isVisible = state.selectedAnswer == state.currentQuestion?.answers?.get(1)
            radioButton.isChecked =
                state.selectedAnswer == state.currentQuestion?.answers?.get(1)
        }
    }

    private fun bindThirdAnswer(state: QuizState) {
        with(binding.thirdAnswer) {
            answerText.text = state.currentQuestion?.answers?.get(2)?.text
            container.setOnClickListener {
                viewModel.setAnswer(state.currentQuestion?.answers?.get(2))
                val isCorrect =
                    state.currentQuestion?.answers?.get(2)?.answerId == state.currentQuestion?.correctAnswerId
                hint.backgroundTintList = ColorStateList.valueOf(
                    if (isCorrect) {
                        requireContext().getColor(R.color.positive_hint)
                    } else {
                        requireContext().getColor(R.color.negative_hint)
                    }
                )
                hint.setTextColor(
                    if (isCorrect) {
                        requireContext().getColor(R.color.positive_text_hint)
                    } else {
                        requireContext().getColor(R.color.negative_text_hint)
                    }
                )
                hint.text = if (isCorrect) {
                    state.currentQuestion?.positiveMessage
                } else {
                    state.currentQuestion?.negativeMessage
                }
            }
            hint.isVisible = state.selectedAnswer == state.currentQuestion?.answers?.get(2)
            radioButton.isChecked =
                state.selectedAnswer == state.currentQuestion?.answers?.get(2)
        }
    }

    private fun bindFourthAnswer(state: QuizState) {
        with(binding.fourthAnswer) {
            answerText.text = state.currentQuestion?.answers?.get(3)?.text
            container.setOnClickListener {
                viewModel.setAnswer(state.currentQuestion?.answers?.get(3))
                val isCorrect =
                    state.currentQuestion?.answers?.get(3)?.answerId == state.currentQuestion?.correctAnswerId
                hint.backgroundTintList = ColorStateList.valueOf(
                    if (isCorrect) {
                        requireContext().getColor(R.color.positive_hint)
                    } else {
                        requireContext().getColor(R.color.negative_hint)
                    }
                )
                hint.setTextColor(
                    if (isCorrect) {
                        requireContext().getColor(R.color.positive_text_hint)
                    } else {
                        requireContext().getColor(R.color.negative_text_hint)
                    }
                )
                hint.text = if (isCorrect) {
                    state.currentQuestion?.positiveMessage
                } else {
                    state.currentQuestion?.negativeMessage
                }
            }
            hint.isVisible = state.selectedAnswer == state.currentQuestion?.answers?.get(3)
            radioButton.isChecked =
                state.selectedAnswer == state.currentQuestion?.answers?.get(3)
        }
    }
}
