package Seminar.Seminar_07.calculator;

import java.util.logging.Logger;

public class LogCalculator implements Calculable {

  private Calculable decoratedCalculater;
  private Loggable logger;

  public LogCalculator(Calculator calculator, Loggable logger) {
    this.decoratedCalculater = calculator;
    this.logger = logger;
  }

  @Override
  public Calculable sum(int arg) {
    int firstArg = decoratedCalculater.getResult();
    logger.log("Первое число: " + firstArg);
    Calculable resaltSum = decoratedCalculater.sum(arg);
    logger.log("Вычислилась сумма: " + resaltSum.getResult());
    return resaltSum;
  }

  @Override
  public Calculable multi(int arg) {
    int firstArg = decoratedCalculater.getResult();
    logger.log("Первое число: " + firstArg);
    Calculable resaltMult = decoratedCalculater.multi(arg);
    logger.log("Вычислилась сумма: " + resaltMult.getResult());
    return resaltMult;
  }

  @Override
  public int getResult() {
    int res = decoratedCalculater.getResult();
    logger.log("Результат " + res);
    return res;
  }

}
