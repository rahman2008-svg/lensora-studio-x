# 📸 Lensora Studio X
> **Edit Photos, Create Designs, Enhance Images — All Offline.**

Developed by **Prince AR Abdur Rahman** & published by **NexVora Lab's Ofc**.

Lensora Studio X is a privacy-focused, 100% offline-first application combining the premium editing power of Snapseed and Lightroom with the rapid graphic template layout canvas of Canva Lite. 
It requires **zero AI API Keys, zero cloud telemetry, and zero account logins**. All algorithms process mathematical pixels directly on device.

---

## 🚀 Key Architectural Features

### 🖼️ Photo Tuning Engine (Snapseed + Lightroom Lite)
- **Essential Color Tools**: Tune exposure, brightness, contrast, saturation, temperature (warm/cool tints), vibrance, and hue shifts directly on standard graphics-accelerated hardware ColorMatrices.
- **Advanced Vignetting**: Gradient shaders draw custom radial exposure falloff towards corners on canvas.
- **Portrait Depth Radial Blur**: Gaussian approximation algorithms combined with radial masks dynamically isolate your focus point.
- **Rule-Based Offine Smart Enhance**: Heuristic pixel intensity trackers dynamically adjust shadows and white balances based on mathematical sample histograms.
- **Face Beautify heuristics**: Bilayer face-smoothing shaders, teeth whitening, and reflection-level brightening operate 100% locally.

### 🎨 Canva Graphic Canvas
- **Multi-layer Composition**: Text, sticker, and shape layers can be drag-translated on the canvas, scaled dynamically via custom modifiers, and edited in real-time.
- **Text customization**: Configure various font faces, color hexes, shadow offsets, and strokes.
- **Preset templates**: Access custom formats like YouTube Thumbnail, Facebook Post, Instagram Story, Flyer, and Poster.

### 📂 Offline Local Database & Analytics (Room DB)
- Save active creations in Room and restore them under the **Draft Room Backups**.
- Save favorite color adjustment setups in **Presets Manager** to use on sandboxed landscapes immediately.
- Zero-tracking offline analytical charts visualize stats like Total Drafts, Exports, editing counters, and saved space.

---

## ⚙️ Tech Stack & CI/CD Pipelines
- **Framework**: Jetpack Compose, Kotlin, MVVM architecture.
- **Database**: Android Room Persistence with KSP (Kotlin Symbol Processing).
- **Gradle**: Kotlin DSL, targeted to **Java 17 / JVM compatibility**.
- **CI/CD Integrations**: Includes live action `.github/workflows/android.yml` for auto-APK/AAB compilation and `codemagic.yaml` for virtual desktop builds.

---

## 👑 Credits & Author
- **Independent Developer**: Prince AR Abdur Rahman
- **Organization**: NexVora Lab's Ofc
- **Contact**: +8801707424006 / +8801796951709
- **Mission**: Build beautifully fast, beautiful, and secure open-source utilities for everyone.
