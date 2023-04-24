package components;

import decode.Decoder;
import encode.Encoder;

public class Paraphrase {

  /**
   * Paraphrase
   */
  private String paraphrase = "";
  /***
   * Keyboard
   */
  Keyboard kbd;
  /***
   * Switcher
   */
  Switcher sw;
  /***
   * Wheel Group
   */
  WheelGroup wg;

  public Paraphrase() {}

  public Paraphrase(Encoder en) {

  }

  public Paraphrase(Decoder de) {}
}
