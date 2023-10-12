package io.github.cakelier;

import cartago.*;

public class LinkedArtifact extends Artifact {
    private int count;

    private void init() {
        this.count = 0;
    }

    /* Add your code here to declare that this operation is part of the linking interface of this artifact. */
    public void increment() {
        this.count++;
        log("The operation \"increment\" was invoked");
    }

    /* Add your code here to declare that this operation is part of the linking interface of this artifact. */
    public void getCount(final OpFeedbackParam<Integer> count) {
        count.set(this.count);
        log("The operation \"getCount\" was invoked");
    }
}
