function handleOnInput(e) {
    e.value = e.value.replace(/[^A-Za-z0-9@.]/g, '');
}