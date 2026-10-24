package de.raindancer.modules.pack;

import de.raindancer.core.ui.help.HelpLint;
import de.raindancer.modules.api.ModuleCommand;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class GuideTest {

    @Test
    @DisplayName("the guide pages read and quote only real settings")
    void theGuideIsComplete() {
        assertThat(HelpLint.of(Path.of("src/main/resources/rains-help"))
                .module("serverpack")
                .settings(PackSettings.class, PackSettings.DEFAULTS)
                .commands(new PackModule().commands().stream().map(ModuleCommand::name).toList())
                .problems()).isEmpty();
    }
}
