# TaskMate – Android To-Do App

TaskMate is a simple and user-friendly Android To-Do application built using **Java**, **XML**, **Firebase Authentication**, and **SQLite**.  
The app allows users to securely log in and manage their daily tasks with smooth swipe actions and persistent local storage.



##  Features

###  Authentication
- User **Sign Up** and **Login** using Firebase Authentication
- Secure email & password authentication
- Session handling:
  - First launch → Login screen
  - After login → Directly opens Home screen
- Logout option available

---

### 📝 Task Management (CRUD)
- Add new tasks
- Update existing tasks
- Delete tasks
- Mark tasks as completed

---

### 👉 Swipe Gestures (Key Feature)
- **Swipe LEFT on a task** → Delete the task
- **Swipe RIGHT on a task** → Update/Edit the task  

These gestures make task management fast and intuitive, similar to modern productivity apps.

---

### 💾 Local Database (SQLite)
- Tasks are stored using **SQLite**
- Data remains safe even if:
  - App is closed
  - App is restarted
- When the app opens again, all tasks are restored automatically

---

### 🎨 UI & Responsiveness
- Clean and modern UI
- Responsive design for small and large screens
- Login and Signup screens aligned consistently
- Keyboard-safe layouts with smooth scrolling

---

## 🛠 Tech Stack

- **Language:** Java  
- **UI:** XML (ConstraintLayout)  
- **Authentication:** Firebase Authentication  
- **Database:** SQLite  
- **IDE:** Android Studio  
- **Version Control:** Git & GitHub  

---

## ⚙️ Setup Steps

### 1. Clone the Repository
```bash
git clone https://github.com/<your-username>/TaskMate.git
```

### 2. Open in Android Studio

- Open Android Studio
- Click on File → Open
- Select the cloned TaskMate project folder
- Wait for Gradle sync to complete successfully

### 3. Firebase Configuration

- Go to Firebase Console
- Create a new Firebase project
- Add an Android app using the same package name as the project
- Download the google-services.json file
- Place the file inside the app/ directory
- Enable Email/Password Authentication from Firebase Authentication settings

### 4. Run the App

- Connect an Android emulator or a physical device
- Click on the Run ▶ button in Android Studio
- The app will launch with a splash screen, followed by the authentication flow (Login / Signup)

### How to download an Apk

-You can directly download and test the app without Android Studio.

### 🔹 Available APK Versions
- **Version 1:** Initial release with basic features and no authentication
- **Version 2:** Improved UI, better responsiveness, and bug fixes and with authentication

📲 **Download the APKs from the GitHub Releases section:**
👉 [https://github.com/nityamTiwari/TaskMate/releases](https://github.com/nityamTiwari/TaskMate/releases/tag/V2.0)

Simply install the APK on your Android device and start using TaskMate.
