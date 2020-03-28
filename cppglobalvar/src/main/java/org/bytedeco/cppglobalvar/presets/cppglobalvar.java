package org.bytedeco.cppglobalvar.presets;

import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(
    target = "org.bytedeco.cppglobalvar",
    global = "org.bytedeco.cppglobalvar.global.cppglobalvar",
    value = {
        @Platform(
            value = {
                "linux-x86_64",
                "macosx-x86_64",
                "windows-x86_64"
            },
            include = "test.h",
            link = "test"
        )
    }
)
public class cppglobalvar implements InfoMapper {
    @Override
    public void map(InfoMap infoMap) {
    }
}
