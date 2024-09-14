package consumer.specific;

import dev.lpa.generic.BaseClass;

public class ChildClass extends BaseClass {

  @Override
  protected void optionalMethod() {

    System.out.println("[ChildClass.optionalMethod]: EXTRA Stuff here");
    super.optionalMethod();
  }

  private void mandatoryMethod() {

    System.out.println("[ChildClass.mandatoryMethod]: My owm important stuff");
  }

  public static void recommendedStatic() {

    System.out.println("[ChildClass.recommendedStatic]: Best Way to Do it");
    optionalStatic();
//    mandatoryStatic();
  }

//  @Override
//  public void recommendedMethod() {
//
//    System.out.println("[ChildClass.recommendedMethod]: Doing it my way");
//    optionalMethod();
////    mandatoryMethod();
//  }
}
