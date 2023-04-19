package com.dimthomas.composition.domain.usecases

import com.dimthomas.composition.domain.entity.GameSettings
import com.dimthomas.composition.domain.entity.Level
import com.dimthomas.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}