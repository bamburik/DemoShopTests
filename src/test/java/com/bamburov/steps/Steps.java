package com.bamburov.steps;

import com.bamburov.utils.Lazy;

public class Steps {
    private Lazy<BrowserSteps> browserSteps = new Lazy<>(BrowserSteps::new);

    public BrowserSteps browser() {
        return browserSteps.getValue();
    }
}
