def call(String gitUrl, String branch) {
    echo 'Cloning GitHub repository...'
    echo "Branch: ${branch}"
    echo "Git URL: ${gitUrl}"

    git branch: branch,
        url: gitUrl

    echo 'Cloning successful!'
}
