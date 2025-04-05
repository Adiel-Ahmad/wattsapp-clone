

```markdown
 WhatsApp Clone

This is a simple WhatsApp clone application built using Android. The app showcases a basic implementation of an Android messaging interface with fragments to display all chats, unread chats, and group chats.

 Table of Contents

 [Overview](overview)
 [Features](features)
 [Screenshots](screenshots)
 [Installation](installation)
 [Usage](usage)
 [License](license)

 Overview

This project simulates the user interface of WhatsApp with basic features like viewing all chats, unread chats, and group chats.

The app uses multiple fragments to navigate between the different types of chat views, and each fragment dynamically loads into a `FrameLayout` when the corresponding button is clicked.

 Technologies Used:
 **Kotlin** for the programming language
 **Android SDK** for building the app
 **Fragments** for creating different sections of the UI
 **ConstraintLayout** for flexible layouts

 Features

 **Splash Screen**: A splash screen that appears when the app starts and transitions to the main page.
 **Navigation Buttons**: The app provides buttons for navigating between different chat sections like All Chats, Unread Chats, and Groups.
 **Fragments**: The app uses fragments to display different types of chats dynamically.
 **Fullscreen UI**: The main screen is displayed in fullscreen mode.

 Screenshots

Here you can add screenshots of your app. Here's how to add them:

```markdown
```
![WhatsApp Image 2025-04-05 at 3 06 19 PM (1)](https://github.com/user-attachments/assets/dd997505-6b7c-4958-952a-c3d0a6590155)
![WhatsApp Image 2025-04-05 at 3 06 19 PM](https://github.com/user-attachments/assets/66b38053-8e73-4150-bc9a-230fbfa27d55)

 Installation

To run this project locally:

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/whatsappclone.git
    ```

2. Open the project in Android Studio.

3. Build and run the project on an emulator or a real device.

 Usage

Once the app is installed and running:

1. **Splash Screen**: After the app starts, you'll see the splash screen for 5 seconds, after which it transitions to the main screen.
   
2. **Main Screen**: On the main screen, there are three buttons to navigate between:
     **All Chats**
     **Unread Chats**
     **Groups**
   
3. Clicking any of these buttons will load the respective fragment into the `FrameLayout` on the screen.

4. The app uses the following fragments:
     **AllFragment**: Displays all the chat information.
     **UnreadFragment**: Displays the unread chat messages.
     **GroupFragment**: Displays the group chat messages.

 Fragments Used:
 **AllFragment**: Handles the display of all chats.
 **UnreadFragment**: Handles the display of unread chats.
 **GroupFragment**: Handles the display of group chats.

 MainActivity:
The `MainActivity` controls the app flow, including the transition from the splash screen to the main page. The buttons on the main page switch between the different fragments dynamically.

 mainpage2 Activity:
The `mainpage2` activity initializes the buttons for navigation and loads the appropriate fragment when clicked.

 License

This project is open source and available under the [MIT License](LICENSE).



 Author

MARIND
```
