package fr.univ_amu.iut.exercice6;

import com.google.inject.name.Named;

/** Implémentation qui écrit les notifications sur la sortie standard. */
public class NotifieurConsole implements Notifieur {

  @Override
  @Named("console")
  public void notifier(String message) {
    System.out.println("[NOTIF] " + message);
  }
}
