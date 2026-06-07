package fr.univ_amu.iut.exercice6;

import com.google.inject.name.Named;

/**
 * Implémentation silencieuse : n'affiche rien (utile par exemple en mode "ne pas déranger"). Sert à
 * illustrer qu'une même interface peut avoir plusieurs implémentations interchangeables.
 */
public class NotifieurSilencieux implements Notifieur {

  @Override
  @Named("silencieux")
  public void notifier(String message) {
    // Volontairement vide : aucune notification.
  }
}
