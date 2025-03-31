document.addEventListener("DOMContentLoaded", () => {
    const addWordButton = document.getElementById("addWord");
    const loadWordsButton = document.getElementById("loadWords");
    const vocabularyList = document.getElementById("vocabularyList");

    addWordButton.addEventListener("click", () => {
        const originalText = document.getElementById("originalText").value;
        const translatedText = document.getElementById("translatedText").value;
        const targetLanguage = document.getElementById("targetLanguage").value;

        const newWord = {
            originalText,
            translatedText,
            targetLanguage
        };

        fetch("http://localhost:8080/api/vocabulary/add", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(newWord)
        })
            .then(response => response.json())
            .then(data => console.log("단어 저장 완료:", data))
            .catch(error => console.error("에러 발생:", error));
    });

    loadWordsButton.addEventListener("click", () => {
        fetch("http://localhost:8080/api/vocabulary/list")
            .then(response => response.json())
            .then(data => {
                vocabularyList.innerHTML = "";
                data.forEach(word => {
                    const li = document.createElement("li");
                    li.textContent = `${word.originalText} - ${word.translatedText} (${word.targetLanguage})`;
                    vocabularyList.appendChild(li);
                });
            })
            .catch(error => console.error("에러 발생:", error));
    });
});