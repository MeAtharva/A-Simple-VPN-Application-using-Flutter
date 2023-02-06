package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import io.xdea.flutter_vpn.FlutterVpnPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterVpnPlugin.registerWith(registry.registrarFor("io.xdea.flutter_vpn.FlutterVpnPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}