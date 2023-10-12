!linker.

+!linker : true <-
    makeArtifact("linkedArtifact", "io.github.cakelier.LinkedArtifactSolution", [], LinkedArtifactId);
    makeArtifact("linkingArtifact", "io.github.cakelier.LinkingArtifactSolution", [], LinkingArtifactId);
    linkArtifacts(LinkingArtifactId, "output_port", LinkedArtifactId);
    runIncrement;
    runGetCount(Count);
    println("The count now is ", Count);
    runIncrementFromAnotherArtifact.

{ include("$jacamoJar/templates/common-cartago.asl") }
