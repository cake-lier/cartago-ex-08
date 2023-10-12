package io.github.cakelier;

import cartago.Artifact;
import cartago.LINK;
import cartago.OpFeedbackParam;

public class LinkedArtifactSolution extends Artifact {
    private int count;

    private void init() {
        this.count = 0;
    }

    @LINK
    public void increment() {
        this.count++;
        log("The operation \"increment\" was invoked");
    }

    @LINK
    public void getCount(final OpFeedbackParam<Integer> count) {
        count.set(this.count);
        log("The operation \"getCount\" was invoked");
    }
}
