package com.example.imguimc.debug;

import imgui.ImGui;
import com.example.imguimc.interfaces.Renderable;
import com.example.imguimc.interfaces.Theme;
import com.example.imguimc.theme.ImGuiDarkTheme;

public class DebugRenderable implements Renderable {

    public static boolean showAboutWindow = false;
    public static boolean showDemoWindow = false;
    public static boolean showMetricsWindow = false;
    public static boolean showUserGuide = false;

    @Override
    public String getName() {
        return "Debug Renderable";
    }

    @Override
    public Theme getTheme() {
        return new ImGuiDarkTheme();
    }

    @Override
    public void render() {
        ImGui.begin("imgui-mc debug");
        ImGui.text("This window is being shown because you are in a fabric mod\ndevelopment environment. It will not be shown in-game.\nYou can enable some builtin imgui windows below.");
        if (ImGui.checkbox("Show about window", showAboutWindow))
            showAboutWindow = !showAboutWindow;
        if (ImGui.checkbox("Show demo window", showDemoWindow))
            showDemoWindow = !showDemoWindow;
        if (ImGui.checkbox("Show metrics window", showMetricsWindow))
            showMetricsWindow = !showMetricsWindow;
        if (ImGui.checkbox("Show user guide", showUserGuide))
            showUserGuide = !showUserGuide;
        ImGui.end();

        if (showAboutWindow)
            ImGui.showAboutWindow();
        if (showDemoWindow)
            ImGui.showDemoWindow();
        if (showMetricsWindow)
            ImGui.showMetricsWindow();
        if (showUserGuide)
            ImGui.showUserGuide();
    }
}
