# RoomMatch

A Java-based desktop application that helps college students find compatible roommates based on lifestyle preferences, using weighted compatibility scoring and deal-breaker filtering.

Developed as a team project as part of CSC coursework at the University of Arizona. The application was designed with feedback from an external stakeholder to improve roommate compatibility, support customizable preferences, and provide transparent matching results.

<img width="975" height="632" alt="RoomMatch dashboard displaying roommate compatibility scores" src="https://github.com/user-attachments/assets/00de20ae-dc64-4ea0-ba33-108e5dee7468" />

## Features

- **User Authentication:** Supports account registration, login, and deletion, with password hashing and validation for duplicate usernames and password mismatches.
- **Roommate Preferences:** Allows users to create and save lifestyle preferences, including sleep schedules, cleanliness, guest frequency, and other customizable categories.
- **Compatibility Scoring:** Calculates normalized compatibility percentages using weighted preference scores and ranks potential roommates based on their preferences.
- **Deal-Breaker Filtering:** Excludes users with conflicting non-negotiable preferences before calculating compatibility scores.
- **Match Explanations:** Displays matched and mismatched preferences, compatibility breakdowns, and potential conflict warnings.
- **Admin Functionality:** Allows administrators to add and remove preference categories, with changes reflected in the database and application.
- **Data Persistence:** Uses SQLite to store user accounts, preferences, and deal-breaker selections across sessions.

## Technologies Used

- **Language:** Java
- **User Interface:** JavaFX, FXML, Scene Builder
- **Database:** SQLite
- **Database Connectivity:** JDBC
- **Security:** BCrypt
- **Development Tools:** Eclipse, Visual Studio Code, Git, GitHub

## Application Architecture

RoomMatch follows a component-based architecture that separates the user interface, application logic, compatibility calculations, and database operations.

- **JavaFX UI:** Handles user interaction, preference selection, and display of roommate matches.
- **RoomMatchGUI:** Manages application navigation and communication between the interface and backend components.
- **DatabaseManager:** Handles SQLite operations, retrieves user profiles, applies deal-breaker filtering, and coordinates match generation.
- **MatchCalculator:** Calculates weighted compatibility scores between eligible user profiles.
- **UserProfile:** Represents user information, lifestyle preferences, and deal-breaker selections.

During match generation, the application retrieves stored profiles, filters out incompatible users based on deal-breakers, calculates weighted compatibility scores for remaining candidates, and displays ranked matches with explanations.

## My Contributions

Served as **Product Owner and Developer** on a four-person team, contributing to core application logic, frontend development, and system integration.

- Developed the initial weighted compatibility scoring logic and structured user preference data for roommate matching.
- Built the JavaFX preference selection interface and integrated the login, preference selection, and main dashboard workflows.
- Implemented the display of saved user preferences and compatibility scores within the main dashboard.
- Enhanced match results with detailed compatibility breakdowns and potential conflict warnings.
- Improved login and registration validation, error handling, and user feedback.

## Application Screenshots

### User Registration and Validation

Users can create accounts with unique usernames and password confirmation. The application provides validation feedback when passwords do not match.

<img width="598" height="767" alt="image" src="https://github.com/user-attachments/assets/73ab5a2f-6106-416f-83e1-9e194f7e7b88" />

<img width="572" height="797" alt="image" src="https://github.com/user-attachments/assets/b8fa5509-a7ce-4c79-8f15-edc884d75152" />

### Preference Selection

Users can select lifestyle preferences, including sleep schedules, cleanliness levels, guest frequency, major, and gender. Preferences can also be marked as deal-breakers to filter incompatible roommate matches.

<img width="622" height="1049" alt="image" src="https://github.com/user-attachments/assets/b0a8261a-74af-4b06-81f7-e253dfa82614" />

### Compatibility Matching

RoomMatch ranks eligible roommates using weighted compatibility scores and provides explanations for matched and mismatched preferences, along with potential conflict warnings.

<img width="975" height="647" alt="image" src="https://github.com/user-attachments/assets/b399d763-3e9c-49ed-b275-74155ead1aff" />

### Account Management

Users can update their preferences, log out and return to their saved profiles, or permanently delete their accounts. Account deletion requires confirmation before proceeding.

<img width="975" height="636" alt="image" src="https://github.com/user-attachments/assets/0312f051-608d-4b76-8350-0ee0c3c663a3" />

## Testing

The team conducted functional and end-to-end testing to verify:

- Account registration, login, and deletion
- Preference storage and retrieval
- Deal-breaker filtering and compatibility rankings
- Navigation between application screens
- SQLite data persistence
- Administrative preference management
