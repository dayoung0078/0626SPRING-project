function postComment() {
    const commentInput = document.getElementById('comment-input');
    const commentText = commentInput.value.trim();
    if (commentText) {
        const commentList = document.getElementById('comments-list');
        const newComment = document.createElement('div');
        newComment.className = 'comment';

        const commentTextNode = document.createElement('span');
        commentTextNode.className = 'comment-text';
        commentTextNode.textContent = commentText;

        const editBtn = document.createElement('button');
        editBtn.className = 'edit-btn';
        editBtn.textContent = '수정';
        editBtn.onclick = function () {
            const editInput = document.createElement('input');
            editInput.type = 'text';
            editInput.value = commentTextNode.textContent;
            editInput.className = 'edit-input';

            const saveBtn = document.createElement('button');
            saveBtn.className = 'save-btn';
            saveBtn.textContent = '저장';
            saveBtn.onclick = function () {
                commentTextNode.textContent = editInput.value.trim();
                newComment.removeChild(editInput);
                newComment.removeChild(saveBtn);
                newComment.appendChild(commentTextNode);
                newComment.appendChild(editBtn);
                newComment.appendChild(deleteBtn);
            };

            newComment.innerHTML = '';
            newComment.appendChild(editInput);
            newComment.appendChild(saveBtn);
        };

        const deleteBtn = document.createElement('button');
        deleteBtn.className = 'delete-btn';
        deleteBtn.textContent = '삭제';
        deleteBtn.onclick = function () {
            commentList.removeChild(newComment);
        };

        newComment.appendChild(commentTextNode);
        newComment.appendChild(editBtn);
        newComment.appendChild(deleteBtn);
        commentList.appendChild(newComment);

        commentInput.value = '';
    }
}
