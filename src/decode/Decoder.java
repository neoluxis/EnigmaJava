package decode;

import components.*;

public class Decoder {

  private final ParaResolver para;
  /***
   * Keyboard
   */
  private final Keyboard kbd;
  /***
   * Switcher
   */
  private final Switcher sw;
  /***
   * Wheel Group
   */
  private final WheelGroup wg;

  /**
   * @return the keyboard
   */
  public Keyboard getKbd() {
    return kbd;
  }

  /**
   *
   * @return the switcher
   */
  public Switcher getSw() {
    return sw;
  }

  /**
   *
   * @return the wheel group
   */
  public WheelGroup getWg() {
    return wg;
  }

  
  /***
   * Initiate the keyboard, switcher, wheel group without any parameter.
   */
  public Decoder() {
    this(0, 0, 0);
  }

  /***
   * Initiate wheel group with 3 parameters.
   */
  public Decoder(int a, int b, int c) {
    this.kbd = new Keyboard();
    this.sw = new Switcher();
    int[] is = { a, b, c };
    this.wg = new WheelGroup(is);
    this.para = new ParaResolver();
  }
}
