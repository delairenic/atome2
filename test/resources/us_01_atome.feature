Feature: Inventaire annuel

  En tant que chimiste
  Je veux pouvoir compter mes éléments dans mon inventaire
  Afin de créer de nouvelles molécules avec le bon nombre d'éléments

  Scenario Outline: Changer le nombre d'électrons d'un atome
    Given étant donnée un atome <atome>
    When quand l'utilisateur change le nombre d'électrons de <nbElectrons>
    Then il nous reste <total> éléctrons

    Examples:
      | atome     | electrons | total |
      | hydrogene | -1        | 0     |