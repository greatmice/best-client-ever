package com.example.imguimc.theme;

import imgui.ImGui;
import com.example.imguimc.interfaces.Theme;

public class ImGuiClassicTheme implements Theme {
    @Override
    public void preRender() {
        ImGui.styleColorsClassic();
    }

    @Override
    public void postRender() {

    }
}