package com.mobteam.taxapp.domain

import com.mobteam.taxapp.domain.model.Answer
import com.mobteam.taxapp.domain.model.Course
import com.mobteam.taxapp.domain.model.Lesson
import com.mobteam.taxapp.domain.model.Question
import com.mobteam.taxapp.domain.model.Quiz

object Courses {
    var course = Course(
        name = "Налоговый вычет",
        shortDescription = "Узнайте что это и как его подавать",
        description = "На этом курсе вы узнаете: что такое налоговый вычет, зачем он нужен и на каких условиях его можно сделать",
        duration = 30,
        previewUrl = "https://cdn.gpb.ru/upload/files/iblock/e6a/x1_main_nalogovyj_vychet_pri_pokupke_v_ipoteku.png",
        lessons = listOf(
            Lesson(
                name = "Что такое налоговый вычет?",
                lessonNumber = 1,
                duration = 5,
                text = "Налоговый вычет — это сумма, на которую при наличии соответствующих " +
                        "оснований уменьшается налогооблагаемая база (доход, с которого уплачивается налог). " +
                        "Правом на оформление налогового " +
                        "вычета обладают резиденты — граждане России и иностранцы, " +
                        "которые уплачивают подоходный налог по ставке 13%.",
                previewUrl = "https://cdn.gpb.ru/upload/files/iblock/e6a/x1_main_nalogovyj_vychet_pri_pokupke_v_ipoteku.png",
                quiz = Quiz(
                    questions = listOf(
                        Question(
                            questionName = "Максимальная налоговая ставка в РФ?",
                            answers = listOf(
                                Answer(answerId = "1A", text = "13%"),
                                Answer(answerId = "1B", text = "10%"),
                                Answer(answerId = "1C", text = "15%"),
                                Answer(answerId = "1D", text = "13%")
                            ),
                            correctAnswerId = "1A",
                            positiveMessage = "Налог составляет 13% в рф. просмотрите еще раз 1ый урок",
                            negativeMessage = "Нет, налог 13%"
                        ),
                        Question(
                            questionName = "Question 2",
                            answers = listOf(
                                Answer(answerId = "2A", text = "Answer 2A"),
                                Answer(answerId = "2B", text = "Answer 2B"),
                                Answer(answerId = "2C", text = "Answer 2C"),
                                Answer(answerId = "2D", text = "Answer 2D")
                            ),
                            correctAnswerId = "2B",
                            positiveMessage = "positive",
                            negativeMessage = "negative"
                        )
                    )
                )
            )
        ),
        isStarted = false,
        isFavourite = false
    )
}
