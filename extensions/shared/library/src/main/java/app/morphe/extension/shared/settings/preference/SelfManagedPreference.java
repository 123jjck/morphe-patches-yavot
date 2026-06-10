/*
 * Copyright (C) 2026 Morphe
 *
 * This file is part of the morphe-patches project:
 * https://github.com/MorpheApp/morphe-patches
 *
 * Licensed under the GNU General Public License v3.0.
 */

package app.morphe.extension.shared.settings.preference;

/**
 * Marker interface for {@link android.preference.Preference} subclasses that
 * manage their own {@link app.morphe.extension.shared.settings.Setting} binding.
 * <p>
 * When a Preference implements this interface, {@link AbstractPreferenceFragment}
 * will skip it during setting–preference sync — the preference is responsible
 * for reading/writing its backing Setting(s) and updating its own UI state.
 * <p>
 * This is the declarative alternative to hard-coding {@code instanceof} checks
 * for every custom preference type.
 *
 * @see AbstractPreferenceFragment#syncSettingWithPreference
 */
public interface SelfManagedPreference {
}
