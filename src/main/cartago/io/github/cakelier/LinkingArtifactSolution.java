package io.github.cakelier;

import cartago.*;

@ARTIFACT_INFO(outports = { @OUTPORT(name = "output_port") })
public class LinkingArtifactSolution extends Artifact {
    @OPERATION
    public void runIncrement() {
        try {
            execLinkedOp("output_port", "increment");
        } catch (final OperationException e) {
            failed(e.getMessage());
        }
    }

    @OPERATION
    public void runGetCount(final OpFeedbackParam<Integer> count) {
        try {
            execLinkedOp("output_port", "getCount", count);
        } catch (final OperationException e) {
            failed(e.getMessage());
        }
    }

    @OPERATION
    public void runIncrementFromAnotherArtifact() {
        try {
            final var anotherArtifact =
                makeArtifact("anotherArtifact", "io.github.cakelier.LinkedArtifact", ArtifactConfig.DEFAULT_CONFIG);
            execLinkedOp(anotherArtifact, "increment");
        } catch (final OperationException e) {
            failed(e.getMessage());
        }
    }
}
