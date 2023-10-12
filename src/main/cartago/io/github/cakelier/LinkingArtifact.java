package io.github.cakelier;

import cartago.*;

/* Add your code here for declaring the output port needed. */
public class LinkingArtifact extends Artifact {
    @OPERATION
    public void runIncrement() {
        try {
            /* Add your code here for invoking the linked "increment" operation on the declared output port. */
        } catch (final OperationException e) {
            failed(e.getMessage());
        }
    }

    @OPERATION
    public void runGetCount(final OpFeedbackParam<Integer> count) {
        try {
            /* Add your code here for invoking the linked "getCount" operation on the declared output port. */
        } catch (final OperationException e) {
            failed(e.getMessage());
        }
    }

    @OPERATION
    public void runIncrementFromAnotherArtifact() {
        try {
            final var anotherArtifact =
                makeArtifact("anotherArtifact", "io.github.cakelier.LinkedArtifact", ArtifactConfig.DEFAULT_CONFIG);
            /* Add your code here for invoking the linked "getCount" operation on the newly created artifact. */
        } catch (final OperationException e) {
            failed(e.getMessage());
        }
    }
}
