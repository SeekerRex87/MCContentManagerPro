# Minecraft File Editor (Android) — by SeekerRex87

**Szybki menedżer plików do Minecraft Bedrock (Android)**: światy (`.mcworld`), dodatki (`.mcaddon`, `.mcpack`), mapy i skiny. Import, naprawa JSON, kreator paczek, porządki, multiselect i bezpieczne zmiany nazw z automatyczną aktualizacją manifestów.

---

## Najważniejsze funkcje
- **Import**: `.mcworld`, `.mcpack`, `.mcaddon`, `.zip` → odpowiednie katalogi gry.
- **Walidacja JSON**: wykrywanie błędów, *auto-fix* najczęstszych problemów (przecinki, cudzysłowy, `uuid`, `format_version`).
- **Kreator paczki**: szybkie tworzenie struktury `behavior`/`resource` z poprawnym `manifest.json` i losowym `uuid`.
- **Multiselect**: kopiowanie, przenoszenie, usuwanie wielu elementów naraz.
- **Porządki**: eliminacja duplikatów, pustych folderów, starych `.mcworld (1).zip` itp.
- **Zmiana nazw**: bezpieczna, z aktualizacją odniesień w JSON (np. `name`, `description`, `dependencies`). 
- **Podgląd**: szybki wgląd w `manifest.json`, `pack_icon.png`, `pack.mcmeta` (jeśli występuje) i pliki `.json`.
- **Tryb tylko do odczytu** (opcjonalnie): aby niczego nie zepsuć na start.
- **Jasny/Ciemny motyw** i praca **offline**.

> ⚠️ **Uwaga**: projekt **nie jest** powiązany z Mojang/Microsoft. Nazwy i formaty plików służą jedynie do kompatybilności.

---

## Instalacja (Quick Start)
1. Zainstaluj APK z sekcji **Releases**.
2. Przy pierwszym uruchomieniu przyznaj **dostęp do pamięci** (Android 13+: osobno wybierz foldery gry).
3. Opcjonalnie włącz **Tryb tylko do odczytu** w Ustawieniach, zanim zaczniesz zmiany.

## Użycie
- **Import**: `+` → wybierz plik (`.mcworld/.mcpack/.mcaddon/.zip`) → *Importuj*.
- **Napraw JSON**: menu kontekstowe pliku → *Sprawdź i napraw*.
- **Kreator paczki**: *Nowa paczka* → wybierz typ (RP/BP) → *Utwórz*.
- **Porządki**: *Narzędzia* → *Wyczyść duplikaty* / *Usuń puste katalogi*.
- **Zmiana nazwy**: długi dotyk → *Zmień nazwę* (aplikacja zaktualizuje manifesty).

## Lokalizacje plików (typowe)
- Światy: `Android/data/com.mojang.minecraftpe/files/games/com.mojang/minecraftWorlds/`
- Resource packs: `.../games/com.mojang/resource_packs/`
- Behavior packs: `.../games/com.mojang/behavior_packs/`
- Skins: w paczkach `.mcpack` lub katalogach zasobów.

---

## Autor / Wsparcie
- **Autor/Developer**: **SeekerRex87**
- Issues i pomysły: zakładka **Issues** w repozytorium.

## Licencja
Kod źródłowy na licencji **MIT** (patrz `LICENSE`). Ikony w tym repozytorium: wolne do użytku z atrybucją `SeekerRex87`.

