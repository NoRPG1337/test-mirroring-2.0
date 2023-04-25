package com.haulmont.shamrock.test.mirroring.2.0;

import com.haulmont.monaco.annotations.AfterStart;
import com.haulmont.monaco.annotations.Module;
import com.haulmont.monaco.container.ModuleLoader;

@Module(name = "test-mirroring-2.0-module", depends = {"monaco-core", "monaco-graylog-reporter", "monaco-sentry-reporter"})
public class TestMirroring2.0Module extends ModuleLoader {
    public TestMirroring2.0Module () {
        super();
        packages("com.haulmont.shamrock.test.mirroring.2.0");
    }

    @AfterStart
    public void postInit() {
        //Implement or remove if not needed
    }
}