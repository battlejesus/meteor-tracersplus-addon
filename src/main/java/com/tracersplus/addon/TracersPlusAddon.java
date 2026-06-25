package com.tracersplus.addon;

import com.tracersplus.addon.modules.TracersPlus;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

public class TracersPlusAddon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOG.info("Tracers+ addon loading...");

        Modules.get().add(new TracersPlus());
    }

    @Override
    public void onRegisterCategories() {
    }

    @Override
    public String getPackage() {
        return "com.tracersplus.addon";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("battlejesus", "meteor-tracersplus-addon");
    }
}