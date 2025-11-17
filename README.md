#  MAD_24172012060_Prac 5

## Project Overview
This Android application demonstrates the use of **Jetpack Compose Navigation** to create a complete user authentication flow. The app showcases a modern UI design with separate login and registration screens, featuring smooth navigation between different composable screens.

## What We Built
This practical focuses on developing a user authentication system with the following core components:

### 🔐 Authentication Screens
- **Login Screen**: Allows users to log in using email and password.
- **Registration Screen**: Enables new users to register by entering detailed information.
- **Navigation Flow**: Smooth transition between login and registration screens using Compose Navigation.

### 🎨 UI Components
- **Custom Form Fields**: Reusable input components with field validation.
- **Material Design 3**: Implements Google’s Material 3 for a polished and modern UI.
- **Card-based Layout**: Form containers use elevated cards for visual hierarchy.
- **Brand Integration**: Incorporates GUNI Pink branding for a consistent design.

### 🧩 Technical Implementation
- **Jetpack Compose**: Used for building a declarative and reactive UI.
- **Navigation Compose**: Manages navigation between screens.
- **State Management**: Uses `remember` and `mutableStateOf` for dynamic state handling.
- **Custom Components**: Created reusable form input components for modularity.

## Key Features Implemented

### 1. Navigation System
- **NavHost**: Set up with login as the start destination.
- **Composable Routes**: Defined routes for “login” and “register” screens.
- **Navigation Controller**: Handles seamless transitions between screens.

### 2. Login Screen
- Email and password input fields.
- “Forgot Password?” link.
- Login button (ready for future authentication logic).
- Option to navigate to the registration screen.

### 3. Registration Screen
- Includes complete user information form:
  - Name  
  - Phone Number (with numeric validation)  
  - City  
  - Email  
  - Password  
  - Confirm Password  
- Registration button (ready for backend integration).
- Navigation back to the login screen.

### 4. Custom Form Components
- **FormField**: Generic input field component.
- **NumericOutlineTextField**: Numeric input with built-in validation.
- **Password Fields**: Secure password input with transformation.
- **Validation**: Real-time input type validation and formatting.

## Technical Specifications

- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 36 (Android 14)
- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Navigation**: Navigation Compose
- **Material Design**: Material 3

## Dependencies Used

- `androidx.compose.ui` - Compose UI framework  
- `androidx.compose.material3` - Material Design 3 components  
- `androidx.navigation.compose` - Navigation for Compose  
- `androidx.activity.compose` - Compose integration for Activities  

## How It Works

1. **App Launch**: Starts with the login screen as the initial destination.  
2. **User Interaction**: Users can enter credentials or switch to the registration screen.  
3. **Navigation**: Navigation controller handles composable transitions.  
4. **Validation**: Input fields feature basic validation and formatting.  
5. **State Management**: Form states are handled with reactive Compose features.

## Screenshots

<!-- Add your screenshots here -->
<div align="center">
  <img width="270" height="600" alt="Login Screen" src="https://github.com/user-attachments/assets/62eb25ce-73eb-45ec-87ea-4e55c7e4bc40" />
  <img width="270" height="600" alt="REg Screen" src="https://github.com/user-attachments/assets/b6f65bf4-fc6c-403e-81d8-3800e33ce8ac" />

</div>

 
## Learning Outcomes

This practical demonstrates:
- Implementation of navigation using Jetpack Compose  
- Creation and reuse of custom UI components  
- Effective state management in Compose  
- Integration of Material Design 3 principles  
- Hands-on practice with modern Android development  

---

**Student**: Vraj Patel (24172012060)  
**Course**: Mobile Application Development  
**Practical**: 5 - Jetpack Compose Navigation
