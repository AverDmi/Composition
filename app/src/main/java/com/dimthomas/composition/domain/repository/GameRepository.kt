package com.dimthomas.composition.domain.repository

import com.dimthomas.composition.domain.entity.GameSettings
import com.dimthomas.composition.domain.entity.Level
import com.dimthomas.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}