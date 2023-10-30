package racing

import racing.service.RacingService
import racing.view.CarTokenizer
import racing.view.InputView
import racing.view.OutputView

fun main() {
    val racingService = RacingService()
    val inputView = InputView()
    val outputView = OutputView()

    val racingHistory = racingService.racing(
        CarTokenizer.tokenize(inputView.participates()),
        inputView.roundCount()
    )
    outputView.printRacingHistory(racingHistory)
    outputView.printWinner(racingHistory)
}
