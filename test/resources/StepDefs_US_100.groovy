import io.cucumber.groovy.PendingException

import static io.cucumber.groovy.Hooks.*
import static io.cucumber.groovy.EN.*

Given(~/^<essai(\d+)> avec <pneu(\d+)>$/) { int arg1, int arg2 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
When(~/^<duree(\d+)> de essai(\d+) est inferieur a <duree(\d+)> de essai(\d+)$/) { int arg1, int arg2, int arg3, int arg4 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
Then(~/^<pneuChoisi> est selectionne automatiquement$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}