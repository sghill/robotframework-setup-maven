*** Settings ***
Library    net.sghill.samples.robotframeworksetup.SimpleLibrary

*** Test Cases ***
Dependency Injection Makes Acceptance Tests Infinity Better
    [Tags]    awesome
    Call Some Keyword Over The Java Bridge

Add two numbers
    ${result}=    add the numbers to calculator    5    20
    Should Be Equal As Numbers    ${result}    25
