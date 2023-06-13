package components;

import decode.Decoder;
import encode.Encoder;

public abstract class Paraphrase {

  /**
   * Paraphrase
   */
  protected String paraphrase;
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

  public Paraphrase() {
    this.kbd = new Keyboard();
    this.sw = new Switcher();
    this.wg = new WheelGroup();
    generateParaph();
  }

  public Paraphrase(Encoder en) {
    this.kbd = en.getKbd();
    this.sw = en.getSw();
    this.wg = en.getWg();
    generateParaph();
  }

  public Paraphrase(Decoder de) {
    this.kbd = de.getKbd();
    this.sw = de.getSw();
    this.wg = de.getWg();
    generateParaph();
  }

  private String generateParaph(){
    this.paraphrase = "";
    return this.paraphrase;
  }

  public final String getParaphrase() {
    return paraphrase;
  }
}
