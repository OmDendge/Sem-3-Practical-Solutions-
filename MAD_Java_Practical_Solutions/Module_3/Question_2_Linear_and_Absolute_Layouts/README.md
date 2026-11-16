# Module 3 – Question 2: LinearLayout and Absolute positioning

**LinearLayout:** Arranges children in a single row or column. The login form uses `orientation="vertical"` so username and password fields are stacked.

**AbsoluteLayout:** This old Android layout used fixed x/y coordinates. It is deprecated because fixed positions break on different screen sizes, densities and orientations. It should not be used in a current app.

**Practical-safe implementation:** The XML demonstrates LinearLayout for the login form and FrameLayout with `layout_gravity` for relative placement of two icons. If the examiner specifically asks what AbsoluteLayout is, explain its coordinate-based placement and deprecation; demonstrate a responsive alternative rather than shipping obsolete code.
