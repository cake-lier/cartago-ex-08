!linker.

+!linker : true <-
    makeArtifact("linkedArtifact", "io.github.cakelier.LinkedArtifact", [], LinkedArtifactId);
    makeArtifact("linkingArtifact", "io.github.cakelier.LinkingArtifact", [], LinkingArtifactId);
    /* Add your code here to link the "LinkingArtifact" and the "LinkedArtifact" together. */
    runIncrement;
    runGetCount(Count);
    println("The count now is ", Count);
    runIncrementFromAnotherArtifact.

{ include("$jacamoJar/templates/common-cartago.asl") }
