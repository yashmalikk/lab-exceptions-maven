package edu.grinnell.csc207.main;

import edu.grinnell.csc207.util.IOUtils;
import edu.grinnell.csc207.util.Quadratic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Interactively compute quadratic roots.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class QR {
  /**
   * Do all the work.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception
   *   If something goes wrong with the I/O or elsewhere.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    int a = IOUtils.readInt(pen, eyes, "Please enter an a (the coefficient of the squared term): ");
    int b = IOUtils.readInt(pen, eyes, "Please enter an b (the coefficient of the squared term): ");
    int c = IOUtils.readInt(pen, eyes, "Please enter an c (the coefficient of the squared term): ");
    pen.println();


    pen.printf("The smaller root of %dx^2 + %dx + %d is %f", a, b, c, (new Quadratic(a, b, c)).smallerRoot());
    pen.println();

    pen.printf("Experimentally, %dx^2 + %dx + %d = 0.", a, b, c);
    pen.println();
    
    eyes.close();
    pen.close();
  } // main(String[])

} // QR
