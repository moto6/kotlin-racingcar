package racing

import racing.service.RacingCar
import racing.view.CarTokenizer
import racing.view.InputView
import racing.view.OutputView

fun main() {
    val racingCar = RacingCar()
    val inputView = InputView()
    val outputView = OutputView()

    outputView.printResults(
        racingCar.racing(
            CarTokenizer.tokenize(
                inputView.participates()
            ),
            inputView.roundCount()
        )
    )
}
